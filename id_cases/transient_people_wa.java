class Transient {
    People a;
    Transient t(Faith f) {
        return f.a.a.a.a.a;
    }
}

class People {
    Faith a;
}


class Faith {
    Transient a;
}