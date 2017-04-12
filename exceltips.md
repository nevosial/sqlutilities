### Some quick reference for basic excel formulae.

 - *VLOOKUP* formula in this case im using it to compare foreign keys from two different sources. I have two sheets like

|A|B|C|D|E|...|
|--|--|--|--|
|**ID**|**Age**|**Name**|**Phone1**|
|NM27|27|nev|90123|
|DM26|26|dan|09012|
|NM11|23|nik|88923|

The second sheet looks like

|A|B|C|D|E|...|
|--|--|--|--|
|**ID**|**Age**|**Name**|**Phone2**|
|NM27|27|nev|90112|
|DM26|26|dan|09014|
|NM11|23|nik|88922|

Using *VLOOKUP* I want to combine both the phone numbers on a single sheet like below:

|A|B|C|D|E|...|
|--|--|--|--|
|**ID**|**Age**|**Name**|**Phone1**|**Phone2**|
|NM27|27|nev|90123|90112|
|DM26|26|dan|09012|09014|
|NM11|23|nik|88923|88922|



 >=VLOOKUP(Value you want to look up, range where you want to lookup the value, the column number in the range containing the return value, Exact Match or Approximate Match – indicated as 0/FALSE or 1/TRUE).
 >- example:  =VLOOKUP(A3,Sheet2!A:B,2,FALSE)
