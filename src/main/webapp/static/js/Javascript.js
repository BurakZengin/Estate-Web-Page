/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var city = new Array();

city['Izmir'] = new Array('Karsiyaka', 'Aliaga', 'Balcova', 'Bayrakli',
        'Bornova', 'Buca', 'Cigli', 'Konak', 'Menemen');
city['Ankara'] = new Array('Kecioren', 'Etlik', 'Altindağ', 'Mamak', 'Yenimahalle',
        'Sincan', 'Cankaya', 'Cubuk', 'Etimesgut', 'Evren', 'Gölbasi', 'Haymana');


function setBolge() {
    cntrySel = document.getElementById('location1');
    stateList = city[cntrySel.value];
    changeSelect('type1', stateList, stateList);
}

function changeSelect(fieldID, newOptions, newValues) {
    selectField = document.getElementById(fieldID);
    selectField.options.length = 0;
    for (i = 0; i < newOptions.length; i++) {
        selectField.options[selectField.length] = new Option(newOptions[i], newValues[i]);
    }
}

function addLoadEvent(func) {
    var oldonload = window.onload;
    if (typeof window.onload !== 'function') {
        window.onload = func;
    } else {
        window.onload = function () {
            if (oldonload) {
                oldonload();
            }
            func();
        };
    }
}

addLoadEvent(function () {
    setBolge();
});