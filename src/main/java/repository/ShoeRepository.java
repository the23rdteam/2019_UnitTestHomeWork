package repository;

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
                return null;
        }

        public Shoe findByHighPrice(int highPrice){
                for (Shoe shoe: shoes) {
                        if (shoe.getHprice().equals(highPrice)) {
                                return shoe;
                        }
                }

                System.out.println("원하는 highPrice " + highPrice + " 를 가지는 신발을 찾지못했습니다.");
                return null;
        }

        public Shoe findByTitle(String title){
                return null;
        }


}
