/*join*/
let joinbtn = document.querySelector("#joinbtn");
joinbtn?.addEventListener('click',() => {

    let frm = document.forms.joinfrm;

    if (frm.userid.value === '') alert('아이디를작성하세요');
    else if (frm.passwd.value === '') alert('비밀번호를작성하세요');
    else if (frm.repwd.value !== frm.passwd.value) alert('비밀번호가 일치하지않아요');
    else if (frm.name.value === '') alert('이름를작성하세요');
    else if (frm.email.value === '') alert('이메일를작성하세요');
    else {
        frm.method = 'post';
        frm.action = '/member/join';
        frm.submit();
    }
});

/*login*/
let loginbtn = document.querySelector("#loginbtn");
loginbtn?.addEventListener('click',() =>{
    let frm = document.forms.loginfrm;
    if(frm.userid.value === '') alert('아이디가비었습니다');
    else if(frm.passwd.value === '') alert('비밀번호가 비었습니다');
    else {
        frm.method = 'post';
        frm.action = '/member/login';
        frm.submit();
    }
});