package me.dio.avengers.domain.avenger

interface AvengerRepository {
    fun getDetail(id: Long): Avenger?
    fun getAvengers(): List<Avenger>
    fun create(avenger: Avenger): Avenger
    fun update(avenger: Avenger): Avenger
    fun delete(id: Long)
}