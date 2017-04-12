### Some quick reference for basic excel formulae.

 #### *VLOOKUP*
 In this case im using it to compare foreign keys from two different sources and get values related to the key in a single sheet.

I have two sheets like

|A|B|C|D|E|...|
|--|--|--|--|
|**ID**|**Age**|**Name**|**Phone1**|
|NM27|27|nev|90123|
|DM26|26|dan|09012|
|NM11|23|nik|88923|

The second sheet looks like

|A|B|C|D|E|...|
|--|--|--|--|
|**ID**|**TAG**|**Location**|**Phone2**|
|NM27|271|SF|90112|
|DM26|261|NYC|09014|
|NM11|231|BOM|88922|

Note that they key is *ID* which is common in both the data sources.

Using *VLOOKUP* I want to combine both the phone numbers on a single sheet like below:

|A|B|C|D|E|...|
|--|--|--|--|
|**ID**|**Age**|**Name**|**Phone1**|**Phone2**|
|NM27|27|nev|90123|90112|
|DM26|26|dan|09012|09014|
|NM11|23|nik|88923|88922|

Following are the steps to achieve this
- Copy both the tables to a two different sheets(sheet1 and sheet2) in a single excel file.
- In the first sheet which will look like


|A|B|C|D|E|...|
|--|--|--|--|
|**ID**|**Age**|**Name**|**Phone1**|
|NM27|27|nev|90123|
|DM26|26|dan|09012|
|NM11|23|nik|88923|
In the coloumn E use the VLOOKUP formula,

>=VLOOKUP(A2,Sheet2!A:D,4,FALSE)

- Carefully note the coloumn index used in *4* this will get all values of the phone2 in the column E. If we use the column index 3 it will show *location* values instead of phone2 and so on if we use column index 2...

#### VLOOKUP Definition

 VLOOKUP(Value you want to look up, range where you want to lookup the value, the column number in the range containing the return value, Exact Match or Approximate Match – indicated as 0/FALSE or 1/TRUE).

 >- example:  =VLOOKUP(A2,Sheet2!A:D,4,FALSE)

>-value you want to lookup: A3

>-range where you want to lookup the values: Sheet2!A:D

>-column number in the range containing the return value: 4

>-Type of Match : FALSE (as we want exact match)
