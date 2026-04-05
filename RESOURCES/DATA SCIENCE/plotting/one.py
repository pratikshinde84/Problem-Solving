import numpy as np
import pandas as pd
df=pd.read_csv("medicine.csv")
print(df.head())
import matplotlib.pyplot as plt
x=[1,2,3,4]
y=[10,20,25,15]
plt.plot(x,y)
plt.xlabel("ages")
plt.ylabel("numbers")

plt.show()