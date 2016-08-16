package classes

interface I

class A
class WithBody {
}

class WithInheritance : I 
class WithInheritance2 : I { }

open class OpenClass1
open class OpenClass2 {}
open class OpenClass3 : I { }

data class MyBean(val v: Int)

sealed class MySealed {
    class Type1 : MySealed()
    class Type2 : MySealed() { 
    }
}

object O
object O2 {
}

class Outer {
    inner class Inner {
    }
}

annotation class A

class WithCompanion {
    companion object {
    }

    object O {
    }
}

@A
class AnnotatedClass

@Annotation1
@Annotation2
class AnnotatedClass2

@AnnotationWithParameter("value")
class AnnotatedClass3

enum class Enum {
    A, B, C
}

