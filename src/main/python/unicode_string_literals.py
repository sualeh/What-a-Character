# Demonstrates Python number parsing functions can handle numeric values from
# other (non-English) languages


def main():
    # How to use Unicode characters in and character literals
    # The hexadecimal values can be in uppercase or lowercase
    # The characters may be in any Unicode plane

    char1 = 'a'
    print(char1)

    char2 = '\u00EA'
    print(char2)

    char3 = '\\'
    print(char3)

    original1 = "a\u00ea\u00f1\u00fcc"
    print(original1)

    original2 = "A\u00EA\u00F1\u00FCC"
    print(original2)


if __name__ == "__main__":
    main()
