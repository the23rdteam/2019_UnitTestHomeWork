package repository;

import domain.Shoe;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;

public class ShoeRepository implements ShoeRepositoryInterface{

        private Collection<Shoe> shoes = new ArrayList<Shoe>();

        @Override
        public void save(Shoe shoe){
                shoes.add(shoe);
                return ;

        }

        @Override
        public Shoe findByLowPrice(){

        }

        @Override
        public Shoe findByHighPrice(){

        }

        @Override
        public Shoe findByTitle(){

        }


}
