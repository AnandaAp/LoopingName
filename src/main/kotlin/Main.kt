fun main() {
    println("Masukan Nama anda untuk dipecah namanya: ")
    val Nama = readLine().toString()
    val NamaHabisDipecah = arrayListOf<String>()
    var temp : String? = null
    for(i in 0..Nama.length-1){
        if(Nama[i] == ' '){
            if (temp != null) {
                NamaHabisDipecah.add(temp)
            }
            println()
            continue
        }
        else if(i == Nama.length){
            break
        }
        else{
            temp = Nama[i].toString()
            print(Nama[i])
        }
    }
//    println("Udah kami pecah jadi perhuruf tuh....\nMasih mau di-eja?")
//    println("1. Ya\n2. Ngga ah males")
//    val pilihan = readLine()?.toInt()
//    when(pilihan){
//        1 -> ejaNamaPerkata(NamaHabisDipecah)
//    }
}

//fun ejaNamaPerkata(Nama: ArrayList<String>) {
//    for(i in 0..Nama.size){
//        if(i % 2 == 0){
//
//        }
//        else{
//            print(Nama[i])
//        }
//    }
//}
