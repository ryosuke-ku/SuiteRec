#!/usr/bin/env python
# -*- coding: utf-8 -*-

import cgi
import codecs

form = cgi.FieldStorage()

# 初回ロード時
if form.list == []:
    html = codecs.open('./html/AssertionRoulette-decs.html', 'r', 'utf-8').read()
# SUBMITボタン押下時
else:
    html = codecs.open('./html/AssertionRoulette-decs.html', 'r', 'utf-8').read()

print("")
print(html)