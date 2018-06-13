function validate() {
    if(document.forms["form"]["name"].value===""){
        focus();
        alert("Fill all fields!");
        return false;
    }
    else
    {
        return true;
    }
}