import pytest

def test_sum_new():
    a = 1
    b = 2
    assert a + b == 3

def test_difference_new():
    a = 3
    b = 4
    assert b - a == 1

@pytest.mark.activity
def test_product_new():
    a = 2
    b = 3
    assert a * b == 6

@pytest.mark.activity
def test_quotient():
    a = 4
    b = 2
    assert a / b == 2

