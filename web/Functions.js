function validate() {
    if(document.forms["form"]["fn"].value===""){
        focus();
        alert("Fill Firstname!");
        return false;
    }
    else
    {
        return true;
    }
   /* if(document.forms["form"]["ln"].value===""){
        focus();
        alert("Fill Lastname!");
        return false;
    }
    else
    {
        return true;
    }
    if(document.forms["form"]["un"].value===""){
        focus();
        alert("Enter username!");
        return false;
    }
    else
    {
        return true;
    }
    if(document.forms["form"]["pass"].value===""){
        focus();
        alert("Enter password!");
        return false;
    }
    else
    {
        return true;
    }
    if(document.forms["form"]["address"].value===""){
        focus();
        alert("Fill address!");
        return false;
    }
    else
    {
        return true;
    }*/
}