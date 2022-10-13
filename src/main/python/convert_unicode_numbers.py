def main():
    # Demonstrates number parsing functions can handle numeric values from
    # other (non-English) languages
    hindiNumber: str = "१२३४५६७८९०"
    number: int = int(hindiNumber)
    print(f"{hindiNumber} = {number}")


if __name__ == "__main__":
    main()
