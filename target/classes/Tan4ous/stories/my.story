
Scenario:  check is enough bonuses for sale
Meta: @first
Given <user> has bought a <product>
When <user> get sum of <points> or bonus
Then sum is <result>

Examples:
|user|points|product|result|
|Mr Jones|10|1|enough|
|Mr Smeet|10|2|not_enough|
|Ms Hugh|10|3|enough|

Scenario:  check is bonuses
Meta: @second
Given <user> has bought a <product>
When <user> get sum of <points> or bonus
Then sum equal <result>

Examples:
|user|points|product|result|
|Mr Jones|10|1|30.0|
|Mr Smeet|10|2|15.0|
|Ms Hugh|10|3|25.0|

Scenario: add new product in the basket
Meta: @third
Given <user> added new product in the basket
When sum of <already> or new product
Then quantity of product equal <result>

Examples:
|user|already|result|
|Mr Jones|1|2|
|Mr Smeet|2|3|
|Ms Hugh|3|4|

Scenario:  A scenario with filtering on examples

Meta:  @os

Given an operating system <value>

Examples:
|Meta:|value|
|@os Linux|Ubuntu|
|@os Unix|OS X|
|@os Windows|XP|




