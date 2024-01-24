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

Encoding in Python

**Sualeh Fatehi**



## Encoding 

See the [presentation on encoding concepts](https://sualeh.github.io/What-a-Character/what-a-character-encoding.pdf) .

![bg right opacity:.5](../common/rosetta-stone.jpg "Rosetta Stone")




## `codecs`

- Provides functions for encoding and decoding
- Supports a wide variety of encodings
- Provides classes for reading and writing data with a specific encoding
- Handles encoding and decoding errors through different error handling schemes


## Converting to Bytes

- Always specify encoding to avoid cross-platform surprises

```python
original: str = ...
utf8_bytes = codecs.encode(original, "utf-8")
round_trip = codecs.decode(utf8_bytes, "utf-8")
```


## Reading Unicode

Specify `encoding` when opening a file.

```python
with open("test.txt", "r", encoding="utf-8") as reader:
    print(reader.read())
```


## Writing Unicode

Specify `encoding` when opening a file.

```python
with open("test.txt", "w", encoding="utf-8") as writer:
    writer.write(string)
```


## String Data in Databases

- `VARCHAR` and `CHAR` specify lengths in bytes, by default
- `NVARCHAR` and `NCHAR` specify lengths in characters, but average to a certain multiplier for bytes


## Code Examples

Slides and all code examples are on GitHub
[https://github.com/**sualeh/What-a-Character**](https://github.com/sualeh/What-a-Character)

![width:300](../common/qr-code.png "QR Code")

