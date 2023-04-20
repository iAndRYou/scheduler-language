def dec(f):
    def g(*args, **kwargs):
        print("dekorator")
        return f(*args, **kwargs)
    return g

@dec
def func(a, b):
    return a+b

@dec
def func2(a, b, c):
    return a+b+c


print(func(1, 2))