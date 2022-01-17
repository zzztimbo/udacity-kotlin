package book

open class Book(val title: String, val author: String) {

    private var currentPage = 0

    open fun readPage() {
        currentPage++
    }

    fun printCurrentPage() {
        println(currentPage)
    }
}

class eBook(title: String, author: String, val format: String = "text"): Book(title, author) {
    private var wordsRead = 0

    override fun readPage() {
        wordsRead += 250
    }

    fun printCurrentWords() {
        println(wordsRead)
    }
}


fun main() {
    val b = Book("foobar", "tim")
    println(b.title)
    println(b.author)
    b.printCurrentPage()
    b.readPage()
    b.readPage()
    b.readPage()
    b.printCurrentPage()


    val eb = eBook("marry popkins", "jim")
    eb.printCurrentPage()
    eb.printCurrentWords()
    eb.readPage()
    eb.readPage()
    eb.readPage()
    eb.printCurrentPage()
    eb.printCurrentWords()
}