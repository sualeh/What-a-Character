---
marp: true
draft: true
theme: uncover
headingDivider: 2
paginate: true
style: |
  section {
    text-align: left;
  }
  ul, ol, li {
    margin-left: 0;
  }
  h2 {
    font-size: 1.5rem;
    color: #0000DD;
  }
  pre {
    font-size: 1.0rem;
  }
_class:
 - lead
 - invert
---

# What a Character

Unicode Support in Python

**Sualeh Fatehi**


## Unicode with Python

![bg right opacity:.5](rosetta-stone.jpg "Rosetta Stone")


## Python Unicode Character Literals

```python
ch1 = 'a'
ch2 = '東'
ch3 = '𐐀'
```
Python can represent characters from the BMP or any other plane.


## Python Unicode Character Literals

- `\uHHHH` - where H is a case-insensitive hexadecimal character
- Only supports the Basic Multilingual Plane
- Supplementary characters are written as **surrogate pairs**

```python
char2 = "\u00EA" # ‘ê’
str1 = "a\u00ea\u00f1\u00fcc" # “aêñüc”
str2 = "A\u00EA\u00F1\u00FCC" # “AêñüC”
```


## Python Unicode Code Point Literals

- `0xHHHHHH` - where H is a case-insensitive hexadecimal character
- Specify code plane with code point
- No surrogate pairs needed


## Python Unicode Code Point Literals

```python
# 'DESERET CAPITAL LETTER LONG I' - 𐐀
cp1 = 0x010400      
string = chr(cp1)   
```

**Result:**

`len(string)` is 1



## Python and Unicode

```python
greek_word = "ΣΚΎΛΟΣ"  # dog
greek_lower = greek_upper.lower()
```

**Result:**
`greek_lower` is "σκύλος"
(Notice that the first and last letter are both sigma)


## Python and Unicode

```python
german_word = "straße"  # street
german_upper = german_word.upper()
```

**Result:**
`german_upper` is "STRASSE"
(Notice that the string lengths are different)


## Python Integer Parsing

```python
hindi_number = "१२३४५६७८९०"
number = int(hindi_number)
```

**Result:**

`number` is 1234567890


## Java Regular Expressions

```java
String hindiNumber = "१२३४५६७८९०";
Pattern.compile("[0-9]*") // bad match
       .matcher(hindiNumber).matches();
Pattern.compile("\\p{Nd}*") // good match
       .matcher(hindiNumber).matches();
```

**Result:**
First match is false but second match is true


## Python Patterns

```python
match_result = re.match("σκύλος", "ΣΚΎΛΟΣ", re.IGNORECASE)
matches = bool(match_result)
```

**Result:**
`match_result` is True


## Use the Character Class

```java
int cp; // some value assigned...
if (Character.isLetter(cp))
// ...
```

**_INSTEAD OF_**
```java
char ch; // some value assigned...
if ((ch >= 'a' && ch <= 'z') ||
    (ch >= 'A' && ch <= 'Z'))
// ...
```


## Use the Character Class

```java
int cp; // some value assigned...
if (Character.isDigit(cp))
// ...
```

**_INSTEAD OF_**
```java
char ch; // some value assigned...
if (ch >= '0' && ch <= '9')
// ...
```


## Code Examples

Slides and all code examples are on GitHub
[https://github.com/**sualeh/What-a-Character**](https://github.com/sualeh/What-a-Character)

![width:300](qr-code.png "QR Code")

