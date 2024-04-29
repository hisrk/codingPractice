//package practiceNew;
//
//public final class ImmutableClass {
//
//    private final  int id;
//
//    private final String name;
//
//
//    private final MutableClass mutable;
//
//    public ImmutableClass(int id, String name, MutableClass mutable) {
//        this.id = id;
//        this.name = name;
//        this.mutable = mutable;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public MutableClass getMutable() {
//        return new MutableClass(mutable);
//    }
//
//    @Override
//    public String toString() {
//        return "ImmutableClass{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", mutable=" + mutable +
//                '}';
//    }
//
//    public static void main(String[] args) {
//
//
//
//
//        MutableClass mutableClass= new MutableClass("waraseoni");
//
//        ImmutableClass immutableClass= new ImmutableClass(1,"srk",mutableClass);
//
//        System.out.println(immutableClass);
//
//        MutableClass mutable1 = immutableClass.getMutable();
//
//        mutable1.setAddress("balaghat");
//
//        System.out.println(immutableClass);
//
//
//
//    }
//
//
//}
