s = ""

with open("test.txt", "r") as f:
    s = f.read()


o = s.replace("\n", " ")

with open("output.txt", "w") as f:
    f.write(o)