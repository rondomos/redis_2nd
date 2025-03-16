
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<script type="text/javascript">
    function checkDuplicateId() {
        var loginid = $('#loginId').val();

        if (loginid.trim() !== "") {
            $.ajax({
            url: "/checkDuplicateId",
            type: "POST",
            data: {"loginId": loginid},
            success: function (data) {
                if (data == 0) {
                    console.log("아이디 사용가능");
                    $('#loginIdError').html("<span> 아이디 사용 가능</span>").css({
                        "color": "#0a53be",
                        "font-weight": "bold",
                        "font-size": "13px"
                     });
                 } else {
                    console.log("아이디 중복")
                    $('#loginIdError').html("<span> 아이디 중복</span>").css({
                        "color": "#FA3E3E",
                        "font-weight": "bold",
                        "font-size": "13px"
                    });
                 }
                }
            });
        } else {
            $('#loginIdError').html(""); // 빈 아이디 입력 시 메시지 삭제

        }
    }

    function checkMatchPassword() {
        var password1 = $('#password1').val();
        var password2 = $('#password2').val();

        $.ajax({
        url: "/checkMatchPassword",
        type: "POST",
        data: {
            "password1": password1,
            "password2": password2
        },
        success: function (data) {
            if (data == 0) {
                $('#passwordError').html("<span> 비밀번호 일치</span>").css({
                    "color": "#0a53be",
                    "font-weight": "bold",
                    "font-size": "13px"
                });
            } else {
                $('#passwordError').html("<span> 비밀번호 불일치</span>").css({
                    "color": "#FA3E3E",
                    "font-weight": "bold",
                    "font-size": "13px"
                });
            }
        }
    })
}
</script>