// $(document).ready(function () {
//     $("#addUserButton").on('click', function (form) {
//         form.preventDefault();
//         var arr = $(this).prev("#addUserForm").serializeArray(), obj = {};
//         $.each(arr, function (indx, el) {
//             obj[el.name] ? obj[el.name].push(e1.value) : (obj[el.name] = [el.value]);
//
//         });
//         // var formData = {
//         //     "firstName": $("#addUserFirstName").val(),
//         //     "lastName": $("#addUserLastName").val(),
//         //     "password": $("#addUserPassword").val(),
//         //     "rePassword": $("#addUserPasswordRe").val(),
//         //     "email": $("#addUserEmail").val(),
//         //     "loginName": $("#addUserLoginName").val(),
//         // };
//
//         console.log(JSON.stringify(obj));
//
//         $.ajax({
//             headers: {'Content-Type': 'application/json'},
//             dataType: "json",
//             url: '/admin/rest',
//             type: "POST",
//             data: JSON.stringify($("#addUserForm").serializeArray()),
//             success: function (res) {
//                 alert(res);
//             },
//             error: function () {
//
//             }
//         });
//     });
// });
$.fn.serializeObject = function () {
    var o = {};
    var a = this.serializeArray();
    $.each(a, function () {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};

$(function () {
    $('#addUserButton').on('click', function () {
        console.log(JSON.stringify($('#addUserForm').serializeObject()));
        $.ajax({
            headers: {'Content-Type': 'application/json'},
            dataType: "json",
            url: '/admin/rest',
            type: "POST",
            data: JSON.stringify($("#addUserForm").serializeObject()),
            success: function (data) {
                console.log(data);
            },
            error: function (data) {
                console.log(data);
                $.each(data.responseJSON, function (index, value) {
                    $('#' + value.field).html(value.code);
                })
            }
        });
        return false;
    });
});
