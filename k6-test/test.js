import http from 'k6/http';
import { check, sleep } from 'k6';

export let options = {
    stages: [
        { duration: '1m', target: 30 },   // 1분 동안 30명으로 증가
        { duration: '5m', target: 200 },  // 5분 동안 200명으로 증가
        { duration: '1m', target: 200 },  // 1분 동안 200명 유지
        { duration: '1m', target: 0 },    // 1분 동안 부하를 0으로 감소
    ],
};

export default function () {
    const res = http.get('http://localhost:8080/v1/movies/nowMovie?movieNm=위로&genre=COMEDI'); // API 엔드포인트
    check(res, {
        'status is 200': (r) => r.status === 200,
        'response time < 200ms': (r) => r.timings.duration < 200,
    });
    sleep(1); // 간격
}