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

                        }

                }


        }


}
