package com.hanghae.commerce.data.domain

import com.hanghae.commerce.user.domain.User
import jakarta.persistence.*
import java.util.Optional

@Entity
@Table(name = "users")
class UserEntity(
    val name: String,
    val age: Int,
    val email: String,
    val address: String,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
) {
    companion object {
        fun toEntity(user: User): UserEntity {
            return UserEntity(
                name = user.name,
                age = user.age,
                email = user.email,
                address = user.address,
            )
        }
    }
}
