package jp.waseda.fuji.kokioe.common.entity

class Entity private constructor(val coordinates: Coordinates) {
    companion object {
        fun of(x: Double, y: Double) = Entity(Coordinates(x, y))
    }

}