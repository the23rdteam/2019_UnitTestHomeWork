package repository;

import domain.Shoe;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ShoeRepositoryTest {


//    기본 메소드 테스트
    @Test
    public void save() {
        Shoe shoe =  mock(Shoe.class);

        // shoe.getTitle()를 호출하면 "운동화"를 리턴한다.
        when(shoe.getTitle()).thenReturn("운동화");
        assertThat(shoe.getTitle(), is("운동화"));
    }

    // List에 들어간 신발들의 양을 조사한다.
    @Test
    public void testShoesSize(){
        List<Shoe> shoes = new ArrayList<Shoe>();
        List<Shoe> shoeSpyList = spy(shoes);
        shoeSpyList.add(new Shoe("운동화","~","a", new Integer("2000"),new Integer("4000"),"네이버", new Integer("2")));
        int shoeSize = shoeSpyList.size();
        System.out.println("ShoeSize : "+ shoeSize );
        assertThat(shoeSize, is(1));
        verify(shoeSpyList, times(1)).size();
    }

    @Test
    public void findByLowPrice() {
        List<Shoe> shoes = mock(List.class);
        Shoe mockShoe = mock(Shoe.class);

        when(mockShoe.getLprice()).thenReturn(new Integer("2000"));
        assertTrue(mockShoe != null);

        shoes.add(new Shoe("축구화","link","img", new Integer("15000"),new Integer("100000"),"다음", new Integer("3")))
        assertThat(shoes.get(0).getLprice(), is(new Integer("15000")));
        verify(shoes).get(0).getLprice();
    }

    @Test
    public void findByHighPrice() {
    }

    @Test
    public void findByTitle() {
    }


//    when - then 사용

}