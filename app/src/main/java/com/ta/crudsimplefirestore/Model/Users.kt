package com.ta.crudsimplefirestore.Model

class Users {
    var nama: String? = null
    var noHp: String? = null
    var email: String? = null
    var pw: String? = null
    var uid: String? = null
    var status = 0

    constructor(
        nama: String?,
        noHp: String?,
        email: String?,
        pw: String?,
        uid: String?,
        status: Int
    ) {
        this.nama = nama
        this.noHp = noHp
        this.email = email
        this.pw = pw
        this.uid = uid
        this.status = status
    }
}