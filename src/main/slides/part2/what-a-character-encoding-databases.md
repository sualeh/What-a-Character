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

Encoding in Databases

**Sualeh Fatehi**



## Encoding 

See the [presentation on encoding concepts](https://sualeh.github.io/What-a-Character/what-a-character-encoding.pdf).

![bg right opacity:.5](../common/rosetta-stone.jpg "Rosetta Stone")


## String Data in Databases

- `VARCHAR` and `CHAR` specify lengths in bytes, by default
- `NVARCHAR` and `NCHAR` specify lengths in characters, but use a certain multiplier for bytes

**You may run out of space if you do not calculate right.**


## Code Examples

Slides and all code examples are on GitHub
[https://github.com/**sualeh/What-a-Character**](https://github.com/sualeh/What-a-Character)

![width:300](../common/qr-code.png "QR Code")

