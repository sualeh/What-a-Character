"""

What a Character
https://github.com/sualeh/What-a-Character
Copyright (c) 2016-2023, Sualeh Fatehi.

This library is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

This work is licensed under the Creative Commons Attribution-ShareAlike
4.0 International License. To view a copy of this license, visit
http://creativecommons.org/licenses/by-sa/4.0/.

"""

# No good programmatic way to get all codecs
# See https://stackoverflow.com/questions/1728376/get-a-list-of-all-the-encodings-python-can-encode-to
import codecs


python_3_available_encodings = ['ascii',
                                'big5',
                                'big5hkscs',
                                'cp037',
                                'cp273',
                                'cp424',
                                'cp437',
                                'cp500',
                                'cp720',
                                'cp737',
                                'cp775',
                                'cp850',
                                'cp852',
                                'cp855',
                                'cp856',
                                'cp857',
                                'cp858',
                                'cp860',
                                'cp861',
                                'cp862',
                                'cp863',
                                'cp864',
                                'cp865',
                                'cp866',
                                'cp869',
                                'cp874',
                                'cp875',
                                'cp932',
                                'cp949',
                                'cp950',
                                'cp1006',
                                'cp1026',
                                'cp1125',
                                'cp1140',
                                'cp1250',
                                'cp1251',
                                'cp1252',
                                'cp1253',
                                'cp1254',
                                'cp1255',
                                'cp1256',
                                'cp1257',
                                'cp1258',
                                'cp65001',
                                'euc_jp',
                                'euc_jis_2004',
                                'euc_jisx0213',
                                'euc_kr',
                                'gb2312',
                                'gbk',
                                'gb18030',
                                'hz',
                                'iso2022_jp',
                                'iso2022_jp_1',
                                'iso2022_jp_2',
                                'iso2022_jp_2004',
                                'iso2022_jp_3',
                                'iso2022_jp_ext',
                                'iso2022_kr',
                                'latin_1',
                                'iso8859_2',
                                'iso8859_3',
                                'iso8859_4',
                                'iso8859_5',
                                'iso8859_6',
                                'iso8859_7',
                                'iso8859_8',
                                'iso8859_9',
                                'iso8859_10',
                                'iso8859_11',
                                'iso8859_13',
                                'iso8859_14',
                                'iso8859_15',
                                'iso8859_16',
                                'johab',
                                'koi8_r',
                                'koi8_t',
                                'koi8_u',
                                'kz1048',
                                'mac_cyrillic',
                                'mac_greek',
                                'mac_iceland',
                                'mac_latin2',
                                'mac_roman',
                                'mac_turkish',
                                'ptcp154',
                                'shift_jis',
                                'shift_jis_2004',
                                'shift_jisx0213',
                                'utf_32',
                                'utf_32_be',
                                'utf_32_le',
                                'utf_16',
                                'utf_16_be',
                                'utf_16_le',
                                'utf_7',
                                'utf_8',
                                'utf_8_sig']


def main():
  # Prints details of all charsets (technically, encoding schemes) supported on
  # the currently running language runtime.
  for encoding_name in python_3_available_encodings:
    codec = codecs.lookup(encoding_name)
    print(codec.name)


if __name__ == "__main__":
    main()
