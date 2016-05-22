-- https://www.hackerrank.com/challenges/weather-observation-station-4

SELECT COUNT(City) - COUNT(DISTINCT City)
FROM Station;
