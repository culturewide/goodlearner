public class dogs implements ourcompare{
    public String name;
    public int  size;
    public dogs(String st, int sz){
        name=st;
        size=sz;
    }
    @Override
    public int compareto(Object o){
        dogs d=(dogs)o;
        if(this.size<d.size){
            return -1;
        } else if (this.size==d.size){
            return 0;
        } else{
            return 1;
        }

    }
}
