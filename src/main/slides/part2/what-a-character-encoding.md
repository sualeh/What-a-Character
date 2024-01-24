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

Encoding - Concepts

**Sualeh Fatehi**



## Encoding 

Encoding specifies conversion of characters to bytes

![bg right opacity:.5](../common/rosetta-stone.jpg "Rosetta Stone")


## Encoding

- **Encoding** is the process of converting code points to a byte representation
- **Decoding** is the process of converting a stream of bytes to code points
- Encoding or decoding may not always be successful


## Common Encodings

![width:1150](common-encodings.png "Common Encodings")


## UTF-32

- Four bytes for all characters
- Does not need surrogate pairs


## UTF-16

- Two bytes for BMP characters
- Four bytes for supplementary plane characters
- Uses surrogate pairs


## UTF-16 Encoding

![width:1150](utf-16.png "UTF-16 Encoding")


## UTF-8

- Most common encoding today
- One byte for ASCII characters
- Two or three bytes for BMP characters
- Four bytes for supplementary plane characters
- Does not need surrogate pairs


## UTF-8 Encoding

![width:1150](utf-8.png "UTF-8 Encoding")


## Encoding Details

![width:1150](encodings.png "Encoding Details")


## Code Examples

Slides and all code examples are on GitHub
[https://github.com/**sualeh/What-a-Character**](https://github.com/sualeh/What-a-Character)

![width:300](../common/qr-code.png "QR Code")

