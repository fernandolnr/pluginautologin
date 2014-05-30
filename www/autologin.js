var phonegapAutologin = {

    phonegapAutologin: function(JSON) {
        cordova.exec(null, null, "Autologin", "phonegapAutologin", [timer]);
    },
};

module.exports = phonegapAutologin; 
