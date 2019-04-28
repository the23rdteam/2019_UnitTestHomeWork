package repository;

import domain.Shoe;

public interface ShoeRepositoryInterface {
    void save(Shoe shoe); // 임호정
    Shoe findByLowPrice(int lowPrice); // 김신원
    Shoe findByHighPrice(); // 김주성
    Shoe findByTitle(); // 허규진
}
