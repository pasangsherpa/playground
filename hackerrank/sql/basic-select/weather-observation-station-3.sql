-- https://www.hackerrank.com/challenges/weather-observation-station-3

SELECT DISTINCT City
FROM Station
WHERE (Id % 2) = 0;
