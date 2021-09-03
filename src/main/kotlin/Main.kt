fun main() {
    println("=============================================================================")
    println("Mesin Pemecah Nama")
    println("=============================================================================")
    println("Masukan Nama anda untuk dipecah namanya: ")

    //variables
    val nama = readLine().toString()
    val namaHabisDipecah = arrayListOf<String>()
    var temp = String()

    //loop
    for(i in nama.indices){
        //logic untuk menampilkan nama sampai ke sebelum whitespace (spasi)
        if(nama[i] == ' '){
            namaHabisDipecah.add(temp)
            temp = ""
            println()
            continue
        }
        /*
        dikarenakan ketika i sudah mencapai limit, dan terjadi error karena masih melakukan pengecekan
        maka saya tambahkan pengecekan apakah sudah mencapai limit, jika sudah maka perulangan berhenti
         */
        //Jika belum sampai whitespace, maka akan menampilkan perhuruf
        else{
            temp += nama[i].toString()
            print(nama[i])
            if (i == nama.length - 1){
                namaHabisDipecah.add(temp)
                break
            }
        }
    }
    print("\nTampilkan:\n1. Nama Depan\n2. Nama Belakang\nTuliskan Pilihanmu: ")
    val pilihan = readLine()
    when(pilihan?.toInt()){
        1 -> println(namaHabisDipecah.first())
        2 -> println(namaHabisDipecah.last())
    }
}
