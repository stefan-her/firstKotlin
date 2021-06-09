import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")

    var year = readLine()?.toInt()!!
    var typeYear = if (year % 4 == 0 && year % 100 > 0 || year % 400 == 0) "bissextile" else "pas  bissextile"
    println("$year ---> $typeYear")

    //-----------------------------------

    var number = readLine()?.toInt()!!
    var degree = when(number) {
        20 -> "Excellent"
        in 17..19 -> "Très bien"
        in 13..16 -> "Bien"
        in 10..12 -> "Suffisant"
        8, 9   -> "Insuffisant"
        else   -> "Echec"
    }

    println("$number ---> $degree")

    //------------------------------------

    val sc = Scanner(System.`in`)

    println("nom :")
    var lastname : String = sc.nextLine()

    println("prénom :")
    var firstname : String = sc.nextLine()

    println("pseudo :")
    var nickname : String? = sc.nextLine().trim();
    nickname = if(nickname != "") nickname else null

    println("email :")
    var email : String = sc.nextLine()

    println("rue :")
    var street : String? = sc.nextLine().trim();
    street = if(street != "") street else null

    println("num :")
    var strNum : String = sc.nextLine().trim();
    var num : Int = if(strNum != "") { strNum.toInt() } else { 0 }

    println("City :")
    var city : String? = sc.nextLine().trim();
    city = if(city != "") city else null

    println("cp :")
    var strCp : String = sc.nextLine().trim();
    var cp : Int = if(strCp != "") { strCp.toInt() } else { 0 }

    sc.close()

    println("""
        nom: $firstname $lastname ${if (nickname != null ) { "---> $nickname" } else { "" }}
        email: $email
        ${ if (street != null && city != null) {
        """
                adresse:
                $street $num
                $cp $city
                """.trimIndent()
    } else { "---" }
    }

        """.trimIndent())

    //------------------------------------

    val sc1 = Scanner(System.`in`)
    println("Insert first INT: ")
    var firstNb : Int = sc1.nextLine().toInt()

    println("Insert Operator ")
    var op : String = sc1.nextLine().trim()

    println("Insert second INT: ")
    var secondNb : Int = sc1.nextLine().toInt()

    sc.close()
    var error : String? = null
    var result : Double? = when (op) {
        "+" -> firstNb + secondNb.toDouble()
        "-" -> firstNb - secondNb.toDouble()
        "*" -> firstNb * secondNb.toDouble()
        "/" -> if(secondNb > 0) {
            firstNb / secondNb.toDouble()
        } else {
            error = "division impossible"
            null
        }
        else -> 0.0
    }

    if(error != null) { println(error) } else { println(result) }
}