
public class TestIsomorphic {

    public static void main (String[] args)
    {
        IIsomorphic isomorphic = new Isomorphic();
        boolean res = isomorphic.areIsomorphic("aab", "xxy");
        System.out.println(res);

        res = isomorphic.areIsomorphic("aab", "xyz");
        System.out.println(res);
    }
}
