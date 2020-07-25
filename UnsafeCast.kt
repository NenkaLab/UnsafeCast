//package

import kotlin.reflect.KClass

@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER", "UNUSED")
object UnsafeCast {
    @JvmStatic
    fun <E, T : Any> castWith(obj: E, type: KClass<T>): T {
        return obj as T
    }
    @JvmStatic
    fun <E, T> castWith(obj: E, type: Class<T>): T {
        return obj as T //type.cast(obj)
    }
    @JvmStatic
    fun <E, T> E.cast(): T {
        return this as T
    }
    @JvmStatic
    fun <T : Any, E> KClass<T>.cast(obj: E): T {
        return obj as T
    }
    /*
    @JvmStatic
    fun <T, E> Class<T>.cast(obj: E): T {
        return obj as T
    }
     */
}
