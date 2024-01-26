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

See the [presentation on encoding concepts](https://sualeh.github.io/What-a-Character/what-a-character-encoding.pdf).

![bg right opacity:.5](../common/rosetta-stone.jpg "Rosetta Stone")




## `TextEncoder` and `TextDecoder`

- Provide functions for encoding and decoding
- Supports a variety of encodings to decode
- Encodes only to UTF-8
- Handles encoding and decoding errors


## Converting to Bytes

- Always specify encoding to avoid cross-platform surprises

```javascript
original = ...
utf8Bytes = new TextEncoder().encode(original);
roundTrip = new TextDecoder("utf-8").decode(utf8Bytes);
```


## Reading Unicode

Specify encoding when opening a file.

```javascript
const fs = require('fs');
fs.readFile('test.txt', 'utf-8', function (err, data) {
  // Ignore errors, print what was read
  console.log(data);
});
```


## Writing Unicode

Specify `encoding` when opening a file.

```javascript
const fs = require('fs');
fs.writeFile('test.txt', string, 'utf-8', function (err) {
  // Ignore errors, write `string`
});
```


## Explicitly Specify Encoding 

**Always explicitly specify encoding to avoid cross-platform surprises.**
You may not always get errors - just garbled data.


## String Data in Databases

- `VARCHAR` and `CHAR` specify lengths in bytes, by default
- `NVARCHAR` and `NCHAR` specify lengths in characters, but average to a certain multiplier for bytes


## Code Examples

Slides and all code examples are on GitHub
[https://github.com/**sualeh/What-a-Character**](https://github.com/sualeh/What-a-Character)

![width:300](../common/qr-code.png "QR Code")

