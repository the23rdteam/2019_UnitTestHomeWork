package repository;

import com.sun.prism.shader.Solid_ImagePattern_Loader;
import domain.Shoe;

import java.util.ArrayList;
import java.util.Collection;

public class ShoeRepository implements ShoeRepositoryInterface{

        private Collection<Shoe> shoes = new ArrayList<Shoe>();

        public void save(Shoe shoe){
                shoes.add(shoe);
                return ;
        }

        public Shoe findByLowPrice(int lowPrice){
                for (Shoe shoe: shoes) {
                        if (shoe.getLprice().equals(lowPrice)) {
                                return shoe;
                        } else {
                                System.out.println("원하는 LowPrice " + lowPrice + "를 가지는 신발을 찾지못했습니다.");

                        }
                }
        }

        public Shoe findByHighPrice(int highPrice){

        }


        public Shoe findByTitle(String title){

        }


}
