function AddNewCar() {
    if (IsHasDVD() & IsHasACCheck() & isSelectManfator() & isSelectedType() & isSelectedYear() & isRightModel()
            & isVaildComments() & isvaildPrice() & validIdMiels()) {
        return true;
    } else {
        return false;
    }
}
function isSelectManfator() {
    select = document.getElementById('Manufacturer');
    err = document.getElementById('errManufacturer');
    if (select.value) {
        err.innerHTML = "";
        err.display = "none";
        return true;
    }
    err.display = "block";
    err.style.color = "red";

    err.style.fontSize = "14px";
    err.innerHTML = "* Manufacturer must be selcted ";
    return false;
}

function isSelectedType() {
    select = document.getElementById('Type');
    err = document.getElementById('errType');

    if (select.value) {
        err.innerHTML = "";
        err.display = "none";
        return true;
    }
    err.display = "block";
    err.style.color = "red";

    err.style.fontSize = "14px";
    err.innerHTML = "* Type must be selcted ";
    return false;
}

function isSelectedYear() {
    select = document.getElementById('YearofManufacturing');
    err = document.getElementById('errYearofManufacturing');
    if (select.value) {
        err.innerHTML = "";
        err.display = "none";
        return true;
    }
    err.display = "block";
    err.style.color = "red";

    err.style.fontSize = "14px";
    err.innerHTML = "* Type must be selcted ";
    return false;
}



function isRightModel() {
    select = document.getElementById('Model').value;
    err = document.getElementById('errModel');
    if (select.length >= 6) {
        err.innerHTML = "";
        err.display = "none";
        return true;
    }
    err.display = "block";
    err.style.color = "red";

    err.style.fontSize = "14px";
    err.innerHTML = "* model should containat least 6 characters long ";
    return false;
}


function isVaildComments() {
    select = document.getElementById('Comments').value;
    err = document.getElementById('errComments');
    if (select.length >= 20) {
        err.innerHTML = "";
        err.display = "none";
        return true;
    }
    err.display = "block";
    err.style.color = "red";

    err.style.fontSize = "14px";
    err.innerHTML = "* comments should containat least 20 characters long ";
    return false;
}

function validIdMiels() {
    select = document.getElementById('Miles');
    var str = document.getElementById("Miles").value;
    var h = str.substr(str.length - 1, str.length);

    var m = h.search(/[0-9]/g) != 0;
    var t = str.search((/[0-9]/g)) != 0;

    err = document.getElementById('errMiles');
    if (t & t>0) {
        err.display = "block";
        err.style.color = "red";

        err.style.fontSize = "14px";
        err.innerHTML = "* Mails must be Integer ";
        return false;
    } else {
        err.innerHTML = "";
        err.display = "none";
        return true;
    }
}


function isvaildPrice() {
    select = document.getElementById('price');
    err = document.getElementById('errPrice');
    var decimal = /^[-+]?[0-9]+\.[0-9]+$/;
    if (select.value.match(decimal)) {
        err.display = "block";
        err.style.color = "red";
        return true;
    } else {
        err.display = "block";
        err.style.color = "red";

        err.style.fontSize = "14px";
        err.innerHTML = "* Price  must be Floating ";
        return false;
    }
}


function IsHasACCheck() {

    select = document.getElementById("yesHaveAC").checked || document.getElementById("NoHaveAC").checked;
    err = document.getElementById('errHasAc');
    if (select === true) {

        err.display = "block";
        err.style.color = "red";
        return true;
    } else {
        err.display = "block";
        err.style.color = "red";

        err.style.fontSize = "14px";
        err.innerHTML = "* Please choice option of seletering has AC or not  ";
        return false;
    }
}

function IsHasDVD() {

    select = document.getElementById("yesHasDVD").checked || document.getElementById("NoHasDVD").checked;
    err = document.getElementById('errHasDVD');
    if (select === true) {

        err.display = "block";
        err.style.color = "red";
        return true;
    } else {
        err.display = "block";
        err.style.color = "red";

        err.style.fontSize = "14px";
        err.innerHTML = "* Please choice option of check Has DVD or not  ";
        return false;
    }
}