//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: User.proto

package com.example.demo.protobuf.entity;

@kotlin.jvm.JvmName("-initializeaddressBook")
inline fun addressBook(block: com.example.demo.protobuf.entity.AddressBookKt.Dsl.() -> kotlin.Unit): com.example.demo.protobuf.entity.User.AddressBook =
    com.example.demo.protobuf.entity.AddressBookKt.Dsl._create(com.example.demo.protobuf.entity.User.AddressBook.newBuilder())
        .apply { block() }._build()

object AddressBookKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    class Dsl private constructor(
        private val _builder: com.example.demo.protobuf.entity.User.AddressBook.Builder,
    ) {
        companion object {
            @kotlin.jvm.JvmSynthetic
            @kotlin.PublishedApi
            internal fun _create(builder: com.example.demo.protobuf.entity.User.AddressBook.Builder): Dsl = Dsl(builder)
        }

        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _build(): com.example.demo.protobuf.entity.User.AddressBook = _builder.build()

        /**
         * An uninstantiable, behaviorless type to represent the field in
         * generics.
         */
        @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
        class PeopleProxy private constructor() : com.google.protobuf.kotlin.DslProxy()

        /**
         * <code>repeated .tutorial.Person people = 1;</code>
         */
        val people: com.google.protobuf.kotlin.DslList<com.example.demo.protobuf.entity.User.Person, PeopleProxy>
            @kotlin.jvm.JvmSynthetic
            get() = com.google.protobuf.kotlin.DslList(
                _builder.getPeopleList()
            )

        /**
         * <code>repeated .tutorial.Person people = 1;</code>
         * @param value The people to add.
         */
        @kotlin.jvm.JvmSynthetic
        @kotlin.jvm.JvmName("addPeople")
        fun com.google.protobuf.kotlin.DslList<com.example.demo.protobuf.entity.User.Person, PeopleProxy>.add(value: com.example.demo.protobuf.entity.User.Person) {
            _builder.addPeople(value)
        }

        /**
         * <code>repeated .tutorial.Person people = 1;</code>
         * @param value The people to add.
         */
        @kotlin.jvm.JvmSynthetic
        @kotlin.jvm.JvmName("plusAssignPeople")
        @Suppress("NOTHING_TO_INLINE")
        inline operator fun com.google.protobuf.kotlin.DslList<com.example.demo.protobuf.entity.User.Person, PeopleProxy>.plusAssign(
            value: com.example.demo.protobuf.entity.User.Person,
        ) {
            add(value)
        }

        /**
         * <code>repeated .tutorial.Person people = 1;</code>
         * @param values The people to add.
         */
        @kotlin.jvm.JvmSynthetic
        @kotlin.jvm.JvmName("addAllPeople")
        fun com.google.protobuf.kotlin.DslList<com.example.demo.protobuf.entity.User.Person, PeopleProxy>.addAll(values: kotlin.collections.Iterable<com.example.demo.protobuf.entity.User.Person>) {
            _builder.addAllPeople(values)
        }

        /**
         * <code>repeated .tutorial.Person people = 1;</code>
         * @param values The people to add.
         */
        @kotlin.jvm.JvmSynthetic
        @kotlin.jvm.JvmName("plusAssignAllPeople")
        @Suppress("NOTHING_TO_INLINE")
        inline operator fun com.google.protobuf.kotlin.DslList<com.example.demo.protobuf.entity.User.Person, PeopleProxy>.plusAssign(
            values: kotlin.collections.Iterable<com.example.demo.protobuf.entity.User.Person>,
        ) {
            addAll(values)
        }

        /**
         * <code>repeated .tutorial.Person people = 1;</code>
         * @param index The index to set the value at.
         * @param value The people to set.
         */
        @kotlin.jvm.JvmSynthetic
        @kotlin.jvm.JvmName("setPeople")
        operator fun com.google.protobuf.kotlin.DslList<com.example.demo.protobuf.entity.User.Person, PeopleProxy>.set(
            index: kotlin.Int,
            value: com.example.demo.protobuf.entity.User.Person,
        ) {
            _builder.setPeople(index, value)
        }

        /**
         * <code>repeated .tutorial.Person people = 1;</code>
         */
        @kotlin.jvm.JvmSynthetic
        @kotlin.jvm.JvmName("clearPeople")
        fun com.google.protobuf.kotlin.DslList<com.example.demo.protobuf.entity.User.Person, PeopleProxy>.clear() {
            _builder.clearPeople()
        }

    }
}

@kotlin.jvm.JvmSynthetic
inline fun com.example.demo.protobuf.entity.User.AddressBook.copy(block: com.example.demo.protobuf.entity.AddressBookKt.Dsl.() -> kotlin.Unit): com.example.demo.protobuf.entity.User.AddressBook =
    com.example.demo.protobuf.entity.AddressBookKt.Dsl._create(this.toBuilder()).apply { block() }._build()
