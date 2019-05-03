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

        }

        public Shoe findByHighPrice(int highPrice){

        }


        public Shoe findByTitle(String title){

                for (Shoe shoe : shoes) {
                        if(shoe.getTitle().equlas(title)){
                                        return shoe;
                        }else {

                                System.out.println("찾고자 하는 " + title + "의 신발을 찾지 못하였습니다.");

                                return null;
                        }

                }


        }


}
