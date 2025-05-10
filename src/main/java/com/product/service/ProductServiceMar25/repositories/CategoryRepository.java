package com.product.service.ProductServiceMar25.repositories;

import com.product.service.ProductServiceMar25.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Override
    Optional<Category> findById(Long aLong);

    Category save(Category category);


    Optional<Category> findByValue(String value);
}

/*
https://docs.spring.io/spring-data/jpa/reference/repositories/query-keywords-reference.html

find…By, read…By, get…By, query…By, search…By(it will return streams of integers)

for ex: findById, findMyDomainTypeById,

…First<number>…, …Top<number>…
exists…By
count…By
delete…By, remove…By
…Distinct…

findByTitleAndDesc
findAllByCreatedAtAfter(date)
findByTitleContainsIgnoreCase

deleteAllById(Iterable<ID> identifiers)

deleteById(ID identifier)

existsById(ID identifier)

findAllById(Iterable<ID> identifiers)

findById(ID identifier)

AND

And

OR

Or

AFTER

After, IsAfter

BEFORE

Before, IsBefore

CONTAINING

Containing, IsContaining, Contains

BETWEEN

Between, IsBetween

ENDING_WITH

EndingWith, IsEndingWith, EndsWith

EXISTS

Exists

FALSE

False, IsFalse

GREATER_THAN

GreaterThan, IsGreaterThan

GREATER_THAN_EQUALS

GreaterThanEqual, IsGreaterThanEqual

IN

In, IsIn

IS

Is, Equals, (or no keyword)

IS_EMPTY

IsEmpty, Empty

IS_NOT_EMPTY

IsNotEmpty, NotEmpty

IS_NOT_NULL

NotNull, IsNotNull

IS_NULL

Null, IsNull

LESS_THAN

LessThan, IsLessThan

LESS_THAN_EQUAL

LessThanEqual, IsLessThanEqual

LIKE

Like, IsLike

NEAR

Near, IsNear

NOT

Not, IsNot

NOT_IN

NotIn, IsNotIn

NOT_LIKE

NotLike, IsNotLike

REGEX

Regex, MatchesRegex, Matches

STARTING_WITH

StartingWith, IsStartingWith, StartsWith

TRUE

True, IsTrue

WITHIN

Within, IsWithin
 */