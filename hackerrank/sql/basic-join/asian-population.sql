-- https://www.hackerrank.com/challenges/asian-population

SELECT SUM(City.Population)
FROM Country
JOIN City
  ON Country.Code = City.CountryCode
WHERE Continent = 'Asia';
