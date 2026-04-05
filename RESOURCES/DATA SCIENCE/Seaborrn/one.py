import seaborn as sns
import pandas as pd
import matplotlib.pyplot as plt
print(sns.get_dataset_names())
penguins=sns.load_dataset('penguins')
a=penguins['species'].value_counts()
print(a)
# sns.scatterplot(data=penguins,x="flipper_length_mm",y='body_mass_g',hue='species')
# plt.show()
# sns.barplot(data=penguins,x='species',y='body_mass_g')
# plt.show()
# sns.boxplot(data=penguins,x='species',y='body_mass_g',hue='species')
# plt.show()
sns.violinplot(data=penguins,x='species',y='body_mass_g',hue='species',split=True)
plt.show()
sns.kdeplot(data=penguins,x='body_mass_g',hue='species',fill=True)
plt.show()