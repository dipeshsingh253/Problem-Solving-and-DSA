package string;

public class DefanginganIPAddress {


    public String defangIPaddr(String address) {

        // StringBuilder sb = new StringBuilder();

        // for(int i=0;i<address.length();i++){

        //     if(address.charAt(i) == '.'){
        //         sb.append("[.]");
        //     }else{
        //         sb.append(""+address.charAt(i));
        //     }

        // }

        // return sb.toString();


        int size = address.length();
        for(int i = 0; i < size; i++) {
            if(address.charAt(i) == '.') {
                address = address.substring(0,i) + "[.]" + address.substring(++i,size);
                size += 2;
            }
        }
        return address;


    }

}
