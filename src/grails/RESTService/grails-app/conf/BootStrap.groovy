import com.bitbucket.learningjava.*

class BootStrap {

    def init = {   servletContext ->
        new Book(title:"The Stand", ISBN: "6789").save()
        new Book(title:"The Shining",ISBN:"7890").save()
    }
    def destroy = {
    }
}
