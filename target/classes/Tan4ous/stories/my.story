
Scenario:  check is enough bonuses for sale

Given <user> has bought a <product>
When <user> get sum of <points> or bonus
Then sum is <result>

Examples:
|user|points|product|result|
|Mr Jones|10|1|enough|
|Mr Smeet|10|2|not_enough|
|Ms Hugh|10|3|not_enough|



